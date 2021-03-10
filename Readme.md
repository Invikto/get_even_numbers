# Task

Get all even numbers from 1 to 100 use one of the following ways:
- for;
- forEach;
- stream.

# Solution

## Steps

1. Create an array of numbers.
2. Filter only even numbers.

## Classes

### Main

Realize the logic of the solution (see the 'Steps').

### BaseSteps

Realize the additional layer to communicate with a user and process exceptions.

It has the following methods:
- `createArray()`;
- `getEvenNumbersFrom()`.

#### createArray()

Receives an array length from the user by a console.

Returns the array of numbers from 1 to the input value.

#### getEvenNumbersFrom()

Receives the array to filter.

Returns the array of even numbers in the console.

### utils.ArrayCreator

A simple utility that creates a required array.

It has the following methods:
- `getSequenceOfNumbersFromOneTo()`.

#### getSequenceOfNumbersFromOneTo()

Receives an array length from the user by a console.

Returns the array of numbers from 1 to the input value.

### utils.ArrayFilter

A simple utility that filters the array.

It has the following properties:
- `array`.

It has the following methods:

- `getEvenNumbersBy()`.

#### array

The array can be filtered.

#### getEvenNumbersBy()

Receives a way to filtering from the user by a console.

Returns the array of even numbers from the input array.
