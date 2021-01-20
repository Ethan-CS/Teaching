# Programming IT, Exercise book 3,

## Arrays


_Dr. Simon Rogers and Prof. Alice Miller_

(v1.0 September 2018)


### 1 Arrays of primitives

1. Write a program that will create an array with length 100 and populate the array with random numbers between 0 and 1. The following code will create a random number
between 0 and 1 (remember to import `java.util.Random`):
```java
Random r = new Random();
double d = r.nextDouble();
```

2. Extend your solution to 1.1 by writing a method that, when passed an `array` of `double` values, computes and returns the average (mean) value.

3. [From class exercise] Write a method that, when passed an `array` of `int` values, finds the first occurence of a particular `int` (pass the reference to the array and the `int` you want to find to the method). If the `int` is in the array, your method should return the position. If not, it should return `-1`.

4. As part 1.3, but find the last occurance.

5. As part 1.3-4, but find all of the occurances. Hints:
    a. you’ll need to return a reference to an array.
    b. you’ll need to make the array before you know how many occurences there are (but you know the maximum possible, right?)
    c. initially set all the values in the array to `-1` so that when the reference is returned, the method calling it knows which values are positions, and which are empty (`-1` cannot possibly be an array index).
    
    
### 2 Multi-dimensional arrays

1. Write a program that, for a given value of `n` (the number of rows / columns), creates a two-dimensional array with that looks like this (here `n = 6`):
```java
1 2 3 4 5 6
0 1 2 3 4 5
0 0 1 2 3 4
0 0 0 1 2 3
0 0 0 0 1 2
0 0 0 0 0 1
```
(Hint: you’ll need to write some code to print it out!)

2. Write a two-player noughts and crosses game. The game should have a 2-dimensional array (of type `char`) that is initially set to blank (space) characters. Players take it in turns to enter the coordinates of their move (i.e. they enter a row and a column. This position on the board is then taken by their symbol (`o` or `x`). Users shouldn’t be able to place their piece on top of an existing piece. Don’t worry about detecting if someone wins or not (although you can if you like). If anyone doesn’t know the game noughts and crosses, see: [link](https://en.wikipedia.org/wiki/Tic-tac-toe)

_Aside: part 2 is a good example of when making an object would be sensible._

_Aside2: All of these exercises require you to use loops. If you’re not sure about them, please do go back and check the loops lectures / exercises. Loops are a fundamental part of programming and it’s worth taking the time to become confident with them now._


### 3 Arrays of objects

1. Use your `Person` object from the previous lab. Create an array of `Person` objects like this: `Person[] people = new Person[4];` Try and call a method on one of the elements in this array. What happens?

2. Set all of the references to refer to legitimate `Person` objects.

3. Write a loop to compute the total age of all of the people in the array.

4. Modify your person object so that it has a new attribute - an array of `Person` references that correspond to this person’s dependents (e.g. children). Assume that each `Person` will have a maximum of 3 children. Write a method to add a child (i.e. a reference to a `Person` object) to the array (you’ll need a new attribute to keep track of how many children the person has in order to know at which position to insert the new reference). Modify the `toString` method of your `Person` class to also give the names and ages of the person’s children.

5. Modify your child adding method so that it can cope with more than 3 children. E.g. when you try and add a child to an already full array, the method should:
    a. Create a new (longer array)
    b. Copy the references from the old one to the new one
    c. Add the new reference
    d. Redirect the reference held by the Person class from the old array, to the new larger array.
    
_Aside: this is the standard method for making an array bigger in Java. I.e. we don’t make it bigger (we cannot) so we make a new, bigger one and copy the things from the old one to the new one, before pointing the original reference to the new array._
