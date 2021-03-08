#!/usr/bin/env python
# coding: utf-8

# # Cycle 4 Lab Exercises - Functions for Data Structures and Plotting
#
# ### Objectives:
# 1. To get more practice devising a data structure, and writing functions to process it
# 2. To make use of a library (`matplotlib`), and practice various kinds of plotting
#
# We’ll be working with a made-up dataset containing information about the production of a fictional vegetable called
# a poturnip (these data are fake, but their distribution and format are the same as some real agricultural data I
# have worked with). On each line of the file` poturnip.csv` are four pieces of information associated with a single
# sale of a shipment of poturnip:
#
# ```
# Price/unit,Production cost/unit,Units produced nationally in month, month,region of sale
# ```
#
# ### Task 0: Designing your data structure
#
# 1. Look at the file` poturnip.csv` 2. Devise your own data structure to store the information in this file,
# and hand-write out your plan. 1. Write out an example of how your data structure might store the information in the
# first three lines of the file 3. Write a function to read the information in poturnip.csv and store the information
# in your data structure.

# In[1]:
import matplotlib.pyplot as plt

# plan for data structure: a list of dictionaries so for the first line:
[{'price': 31.2, 'cost': 27.8, 'monthlyProduction': 32889042, 'month': 2, 'region': 'Ashire'}]


def read_data(filename):
    my_list = []
    try:
        for line in open(filename):
            split = line.strip().split(',')
            price = float(split[0])
            cost = float(split[1])
            monthly_prod = int(split[2])
            month = int(split[3])
            region_name = split[4]
            record = {'price': price, 'cost': cost, 'monthlyProduction': monthly_prod, 'month': month,
                      'region': region_name}
            my_list.append(record)
        return my_list
    except TypeError:
        print('Incorrect type detected ')
        return my_list
    except:
        print('unable to parse line ' + line)
        return my_list
    #  They are likely to have lots of different solutions here for error checking


# ### Task 1: Breaking your own code Now a bit of fun - try to break your file reading function!  Add a line to
# `poturnip.csv` that causes your reading function to throw a runtime exception.  Now, add some error-checking or an
# exception to your function that deals with it.

# In[ ]:


# ### Task 2 - Writing functions to manipulate your data structure
#
# Write several functions to deal with information stored in your data structure:
#
# 1. Write a function `filterByRegion(dataStruct, regionString)` that takes your data structure and a string
# specifying a region as parameters, and returns a new data structure containing only the information for sales from
# the region specified by `regionString`.
#
# 2. Write a function `filterByMonth(dataStruct, month)` that takes your data
# structure and an argument specifying the month as parameters, and returns a new data structure containing only the
# information for sales from the month specified.
#
# 3. Write a function` getPricesPerUnit(dataStruct)` that takes your
# data structure, and returns a list of the prices/unit stored in that data structure (the first column in the file).
#
# 4. Write a function` getCostsPerUnit(dataStruct)` that takes your data structure, and returns a list of the
# production cost/unit stored in that data structure (the second column in the file). 5. Write a function
# `calculateProfitPerUnit(dataStruct)` that takes your data structure, and returns a list of the profits for the
# sales (the difference between the price paid and the costs).

# In[2]:


def filter_by_region(data_structure, region_name):
    new_list = []
    for record in data_structure:
        if record['region'] == region_name:
            new_list.append(record)
    return new_list


def filter_by_month(data_structure, month):
    new_list = []
    for record in data_structure:
        if record['month'] == month:
            new_list.append(record)
    return new_list


def get_prices_per_unit(data_structure):
    list_of_prices = []
    for record in data_structure:
        list_of_prices.append(record['price'])
    return list_of_prices


def get_costs_per_unit(data_structure):
    list_of_costs = []
    for record in data_structure:
        list_of_costs.append(record['cost'])
    return list_of_costs


def get_total_production(data_structure):
    list_of_prod = []
    for record in data_structure:
        list_of_prod.append(record['monthlyProduction'])
    return list_of_prod


def calculate_profit_per_unit(data_structure):
    list_of_profits = []
    for record in data_structure:
        list_of_profits.append(record['price'] - record['cost'])
    return list_of_profits


# ### Task 3 - Extracting information and plotting
#
# Use the functions you wrote as part of Task 2 and any additional bits of code you need to produce a series of plots
# of your data using `matplotlib`
#
# 1. Produce a scatter-plot of the price paid per unit vs the cost of production per unit overall.
# 2. Produce a scatter-plot of the price paid per unit vs the total production in the month of sale
# 3. Produce histograms of the profit/unit for each region.

# In[8]:

dataStruct = read_data('poturnip.csv')
print(get_prices_per_unit(dataStruct[:3]))
print(get_costs_per_unit(dataStruct[:3]))
print(calculate_profit_per_unit(dataStruct[:3]))

# print(filterByMonth(dataStruct, 10))
print(filter_by_region(dataStruct[:3], 'Cshire'))

plt.scatter(get_prices_per_unit(dataStruct), get_costs_per_unit(dataStruct))
plt.show()
plt.clf()
plt.scatter(get_prices_per_unit(dataStruct), get_total_production(dataStruct))
plt.show()
plt.clf()
justAProfit = calculate_profit_per_unit(filter_by_region(dataStruct, 'Ashire'))
plt.hist(justAProfit)
plt.show()
plt.clf()

justBProfit = calculate_profit_per_unit(filter_by_region(dataStruct, 'Bshire'))
plt.hist(justBProfit)
plt.show()
plt.clf()

justCProfit = calculate_profit_per_unit(filter_by_region(dataStruct, 'Cshire'))
plt.hist(justCProfit)
plt.show()
plt.clf()

# Some of this plotting could sensibly be placed in functions!


# ### Task 4 - Stretch Exercise
#
# We could group the months into seasons, with months 12, 1, 2 as winter, 3, 4, 5 as spring, 6, 7, 8 as summer,
# and 9, 10, 11 as autumn.  Write code to produce new data structures with data selected in this way, and produce
# box-plots for profits in each region in each season.  Can you see any difference between the seasons and regions?

# In[13]:


seasonDict = {'winter': [12, 1, 2], 'spring': [3, 4, 5], 'summer': [6, 7, 8], 'autumn': [9, 10, 11]}


def select_on_season(list_of_months, data_structure):
    new_list = []
    for record in data_structure:
        if record['month'] in list_of_months:
            new_list.append(record)
    return new_list


# a more general solution would be to get this list be traversing the data
regions = {'Ashire', 'Bshire', 'Cshire'}

for region in regions:
    for season in seasonDict:
        sub_selected = select_on_season(seasonDict[season], filter_by_region(dataStruct, region))
        #     displaying instead of saving is perfectly fine
        plt.boxplot(calculate_profit_per_unit(sub_selected))
        plt.savefig(str(region) + "_" + str(season) + ".pdf")
        plt.clf()
