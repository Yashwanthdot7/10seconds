def reverse(x, reversed_n = 0):
    if x == 0:
        return reversed_n
    else:
        return reverse(x//10, reversed_n * 10 + x % 10)
    
print(reverse(12345))