# Programming IT, Exercise book 2,

## Objects (Optional Extension)


### Polymorphism

These exercises are not part of the examined material in this course, but if you’re
interested… (we’ll do a lot of this in AP):


1. The savings account object you created in the previous exercise inherits from the
bank account object. Try the following line: 

> `BankAccount b = new SavingsAccount(<arguments>);`

where you should switch `BankAccount` and `SavingsAccoun`t for the names of your classes. What happens?

2. This is an example of **polymorphism**. Try it the other way around - it won’t work. Objects can be referred to by references of their own type, or something higher up the hierarchy.

3. With your savings account being referred to by a bank account reference, try calling the method you wrote for computing interest. It won’t work - you can only call the methods available to the class of the reference.

4. Change one of the methods in the savings account so that it is different to its counterpart in the bank account class (`toString` is a good candidate). Call this method from the bank account reference. Do you get the version of the method defined in bank account, or the one in savings account?
