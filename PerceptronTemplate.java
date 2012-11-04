import java.util.*;
import java.io.*;

class PerceptronTemplate
{
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Error, no input file specified.");
            System.exit(-1);
        }

        Random rgen = new Random();

        double alpha = 0.01;
        int example_count = 0;
        int input_count = 0, output_count = 0;
        int train_count = 0;

        double[][] example_inputs = null;
        int[][] example_outputs = null;

        try {
            Scanner scanner = new Scanner(new File(args[0]));
            example_count = scanner.nextInt();
            input_count = scanner.nextInt();
            output_count = scanner.nextInt();

            // take first 90% of the examples
            train_count = (int)(0.9*example_count);

            example_inputs = new double[example_count][];
            example_outputs = new int[example_count][];
            for(int e = 0; e < example_count; e++) {
                example_inputs[e] = new double[input_count+1];
                example_outputs[e] = new int[output_count];
                for(int i = 0; i < input_count; i++) {
                    example_inputs[e][i] = scanner.nextDouble();
                }
                example_inputs[e][input_count] = 1.0;
                for(int i = 0; i < output_count; i++) {
                    example_outputs[e][i] = scanner.nextInt();
                }
            }
        } catch(Exception e) {
            System.out.println(e);
            System.exit(-1);
        }

        int pred_outputs[] = new int[output_count];

        // network is a matrix of weights; rows represent input values
        // + 1 bias term, columns represent output nodes; so reading
        // down the matrix, for some column, gives the weights for the
        // perceptron associated with the column's output node

        ............


        // print network (as a matrix)
        for(int i = 0; i < (input_count + 1); i++) {
            for(int j = 0; j < output_count; j++) {
                System.out.print(network[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        // try some predictions
        int count_correct = 0;
        for(int e = train_count; e < example_count; e++) {
            // compute prediction


            ............



            boolean correct = true;
            for(int j = 0; j < output_count; j++) {
                if(pred_outputs[j] != example_outputs[e][j]) {
                    correct = false;
                    break;
                }
            }
            if(correct) { count_correct++; }
        }
        System.out.println("Correct: " + ((double)count_correct / (example_count - train_count)));

    }
}
