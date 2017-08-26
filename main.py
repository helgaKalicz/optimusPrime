from math import sqrt
from math import ceil


def optimus_prime(n):
    prime_list = [True]*(n+1)

    for i in range(2, ceil(sqrt(n))):
        for j in range(i*i, len(prime_list), i):
            prime_list[j] = False

    for k in range(2, len(prime_list)):
        if prime_list[k]:
            print(k)


def main():
    optimus_prime(11)


if __name__ == '__main__':
    main()
