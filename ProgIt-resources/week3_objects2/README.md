# Programming IT, Exercise book 2,

## Objects (part 2)

_Dr. Simon Rogers and Prof. Alice Miller_

(v1.0 September 2018)


### 3 Inheritance with People

1. Make a new class (`Student`) that inherits from `Person`. Add an additional attribute that will store the Student’s GPA (a `double`), with associated getter and setter methods.

2. In `Student`, change one of the methods (maybe `toString`?) so that when the method is called it does something different for `Student` than it originally did for `Person`.

3. [optional] Make a second new class (`Lecturer`) that also inherits from `Person`. Add a salary attribute (`private`, with getters and setters).


### 4 Inheritance with BankAccount

The bank you are working for decides to bring in a new savings account. The difference is that savings account get paid interest and cannot go overdrawn (i.e. their balance cannot go below 0.0).

1. Create a new class that inherits from bank account.

2. Modify the `withdraw` method so that it doesn’t allow withdrawals that will take the balance below 0.0.

3. Add a new attribute of type `double` called `interestRate` that is set by the constructor (check back to the slides for `RecyclingBin` about how you also invoke the super constructor).

4. Add a new method that adds interest to the balance. Interest rates are typically expressed as a percentage, so to compute the amount to be added, multiply the balance by `interestRate / 100.0`. E.g. if `interestRate = 10.0`, multiply by `0.1`. Then add this value to `balance`.


### EXTRA: Polymorphism

These exercises are not part of the examined material in this course, but if you’re
interested… (we’ll do a lot of this in AP):

1. The savings account object you created in the previous exercise inherits from the
bank account object. Try the following line: 

> `BankAccount b = new SavingsAccount(<arguments>);`

where you should switch `BankAccount` and `SavingsAccoun`t for the names of your classes. What happens?

2. This is an example of **polymorphism**. Try it the other way around - it won’t work. Objects can be referred to by references of their own type, or something higher up the hierarchy.

3. With your savings account being referred to by a bank account reference, try calling the method you wrote for computing interest. It won’t work - you can only call the methods available to the class of the reference.

4. Change one of the methods in the savings account so that it is different to its counterpart in the bank account class (`toString` is a good candidate). Call this method from the bank account reference. Do you get the version of the method defined in bank account, or the one in savings account?
