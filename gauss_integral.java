import math

def gauss_integral():
    a = -10  # dolna granica całkowania
    b = 10  # górna granica całkowania
    n = 1000  # liczba węzłów

    # Współczynniki dla węzłów i wag
    nodes, weights = math.polynomial.legendre.leggauss(n)

    integral = 0
    for i in range(n):
        x_i = ((b-a)*nodes[i] + b + a) / 2  # transformacja liniowa z przedziału (-1, 1) na (a, b)
        integral += weights[i] * math.exp(-x_i**2)  # obliczanie całki

    integral *= (b - a) / 2  # mnożenie przez połowę przedziału

    return integral

result = gauss_integral()
print(result)
