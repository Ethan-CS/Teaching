import time
import random
import matplotlib.pyplot as plt


# complexity is O(n)
def traversal_function(my_list):
    for i in range(len(my_list)):
        my_list[i] = my_list[i] + 3


# complexity is O(n^2)
def double_traversal_function(my_list):
    for i in range(len(my_list)):
        for j in range(len(my_list)):
            my_list[i] = my_list[i] + 3


# complexity is O(1)
def silly_function(my_list):
    return my_list[0]


# complexity is O(n)^3
def function_ahoy(my_list):
    items = []
    for item in my_list:
        for i in range(len(my_list)):
            for j in range(i, len(my_list)):
                items.append(str(item) + str(i * j) + 'ahoy')
    return items


# complexity is O(n) - this is a sneaky one: the outer for loop doesn't depend on the size of the input, and that is
# why we have O(n) instead of O(n^2)
def function_foo(my_list):
    new_list = []
    for i in range(7):
        for j in range(len(my_list)):
            new_list.append(i * my_list[j])


# complexity is O(n^2): the traversal function is O(n), and we do that O(n) times
def practice_function(my_list):
    for i in range(len(my_list)):
        traversal_function(my_list)


def test_runtimes(max_size):
    max_n = int(max_size)
    increment = int(max_size / 100)
    if increment < 1:
        increment = 1

    inputs = []
    for i in range(0, max_n + 1, increment):
        res = random.sample(range(0, max_n), i)
        inputs.append(res)
    plot_runtimes(traversal_function, inputs)


# Task 1a -  complexity is O(n)
def find_sum(my_list):
    total = 0
    for item in my_list:
        total = total + item
    return total


# Task 1b -  complexity is O(n)
def find_max(my_list):
    max_so_far = my_list[0]
    for item in my_list:
        if item >= max_so_far:
            max_so_far = item
    return max_so_far


# Task 1c -  complexity is O(n^2)
def check_unique(my_list):
    for i in range(len(my_list)):
        for j in range(len(my_list)):
            if i != j and my_list[i] == my_list[j]:
                return False
    return True


# Task 0
def plot_runtimes(func, list_of_inputs):
    times = []
    sizes = []
    for inputItem in list_of_inputs:
        sizes.append(len(inputItem))
        t = time.process_time()
        func(inputItem)
        elapsed_time = time.process_time() - t
        times.append(elapsed_time)
    plt.plot(sizes, times)
    plt.savefig('output.pdf')


test_runtimes(10000)

# Hints for stretch tasks: we can build an O(n^5) function with five nested looks, all of which execute a linear
# number of times int he size of the input O(n!) is a tougher one we need to consider all possible orderings of
# something.  This will be very tricky with the tools we know so far. O(n log n) is even tougher!  If this one held
# you up and you want to rey again, wait until after you've seen binary search, and then see if you can think of a
# way. Other example O(n log n) algorithms include various advanced sorting techniques - you could look up quicksort
# or mergesort.
