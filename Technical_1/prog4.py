# def reverse(x, reversed_n = 0):
#     if x == 0:
#         return reversed_n
#     else:
#         return reverse(x//10, reversed_n * 10 + x % 10)
    
# print(reverse(12345))

def func(x, rev):
    if x == 0:
        return rev
    rem = x % 10
    rev = rev * 10 + rem
    return func(x//10, rev)

print(func(1234, rev=0))