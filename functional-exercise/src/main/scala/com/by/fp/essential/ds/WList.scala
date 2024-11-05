package com.by.fp.essential.ds

enum WList[+A]:
  case Nil                           extends WList
  case Cons(head: A, tail: WList[A]) extends WList

object WList:
  /*
    The function apply in the object List is a variadic function, meaning it accepts zero
    or more arguments of type A:
   */
  def apply[A](as: A*): WList[A] = // Variadic function syntax
    if as.isEmpty then Nil
    else Cons(as.head, apply(as.tail*))

  /*def sum(ints: WList[Int]): Int = ints match // A function that uses pattern matching to add up a list of integers
    case Nil => 0 // The sum of the empty list is 0.
    case Cons(x, xs) => x + sum(xs) // The sum of a list starting with `x` is `x` plus the sum of the rest of the list.

  def product(doubles: WList[Double]): Double = doubles match
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)*/