def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)
print(fibonacci(10))  # Exemplo de uso: calcula o 10º número de Fibonacci

# n = 2 -> 3
#n = 3 -> 5 -->2^n
#n = 4 -> 9
#n = 5 -> 15