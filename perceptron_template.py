#!/usr/bin/python
import sys
import random
# use random to randomly initialize weights and sample data randomly


def configure():
    """Reads configuration data from the file.

       returns: f, the file object
                the total number of training samples
                the number of inputs in each training sample
                the number of outputs in each training sample
    """
    try:
        script, infile = sys.argv
    except ValueError:
        print "Error, no input file specified"
        exit(-1)
    try:
        f = open(infile, "r")
    except IOError as e:
        print e
        exit(-1)
    return [f].extend((int(x) for x in f.readline.split()))


def read_data(infile, input_count):
    """Reads the data from the file into a list of inputs and outputs
    """
    example_inputs = []
    example_outputs = []

    for line in infile.readlines():
        line = line.split()
        example_inputs.append(line[:input_count])
        example_outputs.append(line[input_count:])
    return example_outputs, example_inputs


def print_weights(network, input_count, output_count):
    """Prints the weight matrix of a single layer perceptron.
    """
    for neuron_index in xrange(input_count):
        for output_index in xrange(output_count):
            print "%s   " % network[neuron_index][output_index],
        # prints a newline
        print ""


def validate(network, train_count, example_count, output_count,
             example_outputs):
    """Returns the number of correctly classified samples from the cross
    validation set.
    """
    correct = 0
    for i in xrange(train_count, example_count):
        # compute prediction, it will be list with one of these zeroes as a one
        pred_outputs = [0 for x in xrange(output_count)]
        if all(map(lambda x, y: x == y, pred_outputs, example_outputs[i])):
            correct += 1
    return correct


def main():
    """Example main function.
    """
    infile, example_count, input_count, output_count = configure()
    example_inputs, example_outputs = read_data(infile, input_count)

    # take the first 90% of the examples
    train_count = int(0.9 * example_count)

    # network is a matrix of weights; rows represent input values + 1
    # bias term, columns represent output nodes; so reading down the
    # matrix, for some column, gives the weights for the perceptron
    # associated with the column's output node

    # ..........

    # uncomment this to print the network to the terminal
    # print_weights(network, input_count, output_count)

    # try some predictions
    correct = validate(network, train_count, example_count, output_count,
                       example_outputs)
    print "Correct: %f" % (float(correct) / (example_count - train_count))


if __name__ == "__main__":
    main()
