import random


def iterative_binary_search_buggy1(my_list, value):
    lo, hi = 0, len(my_list) - 1
    while lo < hi:
        mid = (lo + hi) // 2
        if my_list[mid] < value:
            lo = mid + 1
        elif value < my_list[mid]:
            hi = mid - 1
        else:
            return mid
    return -1


def iterative_binary_search_buggy2(my_list, value):
    lo, hi = 0, len(my_list) - 1
    while lo <= hi:
        mid = (lo + hi) // 2
        if my_list[mid] < value:
            lo = mid + 1
        elif value <= my_list[mid]:
            hi = mid - 1
        else:
            return mid
    return -1


def iterative_binary_search_buggy3(my_list, value):
    lo, hi = 0, len(my_list) - 1
    while lo <= hi:
        mid = (lo + hi) // 2
        if my_list[mid] <= value:
            lo = mid + 1
        elif value < my_list[mid]:
            hi = mid - 1
        else:
            return mid
    return -1


# Task 1

def find_mean(my_list):
    return sum(my_list) / len(my_list)


def simple_search_with_count(my_list, target, counts_list):
    compare_count = 0
    for j in range(len(my_list)):
        compare_count = compare_count + 1
        if my_list[j] == target:
            counts_list.append(compare_count)
            return j
    counts_list.append(compare_count)
    return -1


numbers_list = list(range(100))
list_of_counts = []
for i in range(100):
    random.shuffle(numbers_list)
    simple_search_with_count(numbers_list, 42, list_of_counts)

print('Mean number of comparisons: ' + str(find_mean(list_of_counts)))


# Task 2

# Errors are on lines 3, 20, 31, in the comparisons.  Any trace that shows these is acceptable answer -
# *it is a good idea to be able to give an input that triggers a bug and show how it does*.
# For fix, could end up with something like:
def iterative_binary_search_fixed(my_list, value):
    lo, hi = 0, len(my_list) - 1
    while lo <= hi:
        mid = (lo + hi) // 2
        if my_list[mid] < value:
            lo = mid + 1
        elif value < my_list[mid]:
            hi = mid - 1
        else:
            return mid
    return -1


#  Task 3 solution
def binary_search(my_list, lo, hi, value):
    if len(my_list) < 1:
        return -1
    if lo > hi:
        return -1

    mid = lo + (hi - lo) // 2
    mid_value = my_list[mid]
    if mid_value == value:
        return mid
    elif mid_value < value:
        return binary_search(my_list, mid + 1, hi, value)
    else:
        return binary_search(my_list, lo, mid - 1, value)


# Task 4 - stretch tasks hints
# for 4.1, have a look at adapting last cycle's solutions
# for 4.2: think about what you want to look for in this adapted binary search.
# In vanilla binary search, I'm looking to see if the mid value is the same as the value I'm looking it,
# but for this new version, I want to see if it has a number *below* it to the left, and one *below* it to the right
# think also about the signal that I am too hi vs too lo in the list - it will have to do with whether the numbers
# are increasing or decreasing.
