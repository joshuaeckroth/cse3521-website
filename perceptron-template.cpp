#include <iostream>
#include <fstream>
#include <cstdlib>
using namespace std;

int main(int argc, char** argv)
{
    if(argc != 2) {
        cout << "Error, no input file specified." << endl;
        return -1;
    }

    srand(time(NULL));

    ifstream data(argv[1]);
    if(!data.is_open()) {
        cout << "Error opening data file." << endl;
        return -1;
    }

    double alpha = 0.0000001;

    int example_count;
    int input_count, output_count;
    data >> example_count >> input_count >> output_count;

    // take first 90% of the examples
    int train_count = (int)(0.9*example_count);

    double** example_inputs = new double*[example_count];
    bool** example_outputs = new bool*[example_count];
    for(int e = 0; e < example_count; e++) {
        example_inputs[e] = new double[input_count+1];
        example_outputs[e] = new bool[output_count];
        for(int i = 0; i < input_count; i++) {
            data >> example_inputs[e][i];
        }
        // set fixed bias input
        example_inputs[e][input_count] = 1.0;
        for(int i = 0; i < output_count; i++) {
            data >> example_outputs[e][i];
        }
    }

    bool *pred_outputs = new bool[output_count];

    // network is a matrix of weights; rows represent input values + 1
    // bias term, columns represent output nodes; so reading down the
    // matrix, for some column, gives the weights for the perceptron
    // associated with the column's output node


    ............


    // optional: print network (as a matrix)
    for(int i = 0; i < (input_count + 1); i++) {
        for(int j = 0; j < output_count; j++) {
            cout << network[i][j] << "\t";
        }
        cout << endl;
    }
    cout << endl << endl;

    // try some predictions
    for(int e = train_count; e < example_count; e++) {

        // compute prediction


        ............


        // compute loss


        ............

    }

    // report total loss

    return 0;
}
