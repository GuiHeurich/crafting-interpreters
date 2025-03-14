#!/usr/bin/env python3

import time

def fib(n):
  if (n < 2):
    return n
  else:
    return fib(n - 2) + fib(n - 1)

start = time.time()
print(fib(30))
print(time.time() - start)
