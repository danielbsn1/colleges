
def Permutation(data, n):
    # Heap's algorithm for generating permutations
    if n == new_func():
        print(data)
        return

    for i in range(n):
        Permutation(data, n - 1)
        if n % 2 == 0:
            data[i], data[n - 1] = data[n - 1], data[i]
        else:
            data[0], data[n - 1] = data[n - 1], data[0]

def new_func():
    return 1


if __name__ == '__main__':
    data = [1, 2, 3]
    Permutation(data, len(data))

# 3x2x1 = 6 = 3! fatoriais