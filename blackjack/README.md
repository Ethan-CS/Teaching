# Blackjack

## About this project

I first created this project for the University of Glasgow Graduate Apprenticeship course first year module _Foundations of Professional Software Engineering_ in December 2020. The aim of this was primarily to demonstrate the implementation of the _singleton_ design pattern in Java, namely in the Deck class. This means that, when Blackjack is running, we can add or take from the same deck without fear of re-generating the deck and dealing card duplicates. Some of the students suggested implementing Player as a singleton, which would allow us - as in the casino version of the game - to add and remove players as the game goes on, which I aim to do in the near future.

The secondary purpose of this repo is to allow students to practice navigating a GitHub repo, cloning/forking where necessary and especially importing the project into their own IDE. This was developed in IntelliJ, but should run (with some practice, fairly painlessly) in any Java IDE.

### Importing

Below are a few points to keep in mind when importing this project into your own development environment.
* Either choose the native import function of your IDE or create a new project from existing Java code files
* Remember to change the package (or indeed put the files into a package called `io.github.ethankelly`
  * This choice of package is deliberate: it is common practice in Java to name your package something like your web address, if you have one, but swapped around a little. For instance, if my web address was google.com, my package should be called `com.google` and my website is located at [ethankelly.github.io](https://ethankelly.github.io), where the github.io indicates it's hosted using [GitHub Pages](https://pages.github.com/), and so my package name is generally `io.github.ethankelly` - the address of my website, reversed. If you have your own personal website, when you import this project you may like to put the files into a package using this convention based on your web address.
  

## Rules

This file contains a Java project that plays the (North American version of) Blackjack. This is subject to the following rules:
* Each player is dealt 2 cards. The dealer is dealt 2 cards, one face-up and one face-down.
* Cards are equal to their value; face cards are worth 10 and an Ace can be 1 or 11.
* The player's cards are added up for their total.
* Players “Twist” to gain another card from the deck. Players “Stick” to keep their current card total.
* Dealer “Twists” until they equal or exceed 17.
* The goal is to have a higher card total than the dealer without going over 21.
* If the player total equals the dealer total, it is a “Push” and the hand ends.
* Players win their bet if they beat the dealer. Players win 1.5x their bet if they get “Blackjack” which is 21.
