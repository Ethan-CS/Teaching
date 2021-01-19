# Programming IT, Exercise book 2a,

## Objects

_Dr. Simon Rogers and Prof. Alice Miller_

(v1.0 September 2018)

These exercises are designed to help you become familiar with creating and working with objects. As with the previous exercise book, work through at your own pace!

### 1 People

1. In the lectures we made a class to represent a person. Make your own `Person` class, including one additional attribute, or one additional method. All attributes should be `private`, and getters and setters should be included to allow attributes to be changed.
2. In a separate file (i.e. a separate class), write a `main` method that demonstrates the use of your `Person` class.
3. Give your `Person` class a `toString` method and use it in your `main` method.


### 2 Bank account

The aim of these tasks is to produce an object that will represent a bank account. You will also use your person class again.

1. Create a class that represents the skeleton of a bank account (call it `BankAccount`). _Remember, by convention attributes should be declared `private` and accessed using getters._ It should have attributes for:
  a. The account holders name (`name`)
  b. The account number (`accountNumber`)
  c. The account balance (`balance`; how much money is left in the account)
  d. A `static int` attribute called `nextAccountNumber` that is initially set to zero.
2. Create a constructor for the account that takes as an argument the account holder's name. In the constructor set:
  a. the `name` attribute to the name that has been passed in.
  b. `balance` to 0.0
  c. The `accountNumber` to the value of `nextAccountNumber` and then increment `nextAccountNumber` by 1.
3. Create a getter (but not a setter) for the account number attribute.
4. Create another class, and in a main method make two bank account objects. Print their account numbers. Are they what you expect? Can you explain why it’s happening? (hint: the `nextAccountNumber` attribute is `static`...)
5. Add methods to your class that allow other things to access the balance, deposit funds and withdraw funds. In the latter two cases, don’t forget to update the balance. Also, add a toString method that displays the name, account number, and balance.
6. Test the methods from 5 in your main method.

You will now see how to use your `Person` and `BankAccount` objects together
7. In your `main` method, create a `Person` (using the `Person` class you made in the previous section).
8. Modify your `BankAccount` object so that instead of storing a customer name, it stores a `Person object` instead (pass the object reference to the constructor). Some hints: you’ll need to change...
  a. The type of the class attribute (variable) in `BankAccount` (the one that was the account holder's name)
  b. The arguments to the constructor
  c. The `toString` method for `BankAccount`
9. Demonstrate the use of `Person` in `BankAccount` by creating two bank accounts for the same person.

In the following, you will see how `BankAccount` objects can manipulate other `BankAccount` objects.
10. Create a new method called `transferFunds` in the `BankAccount` class. This method should take two arguments: a `double` amount to transfer from the account, and another `BankAccount` object into which the funds should be transferred. Fill in the method with the necessary operations to withdraw the funds from one account, and deposit them in another.
