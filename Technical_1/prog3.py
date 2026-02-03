def func(x):
    if x == 11:
        return "biscuit"
    print(x)
    a = func(x+1)
    print(x)
    return a

print(func(1))