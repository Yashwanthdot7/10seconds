def func(x):
    if x == 11:
        print("biscuit")
        return
    print(x)
    func(x+1)
    print(x)

func(1)