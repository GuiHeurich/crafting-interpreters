#!/usr/bin/env ruby

def fib(n)
  if (n < 2)
    n
  else
    fib(n - 2) + fib(n - 1)
  end
end

start = Time.now
puts fib(30)
puts Time.now - start







