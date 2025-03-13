num = int(input("Escolha um numero para mostrar se é primo: "))
if(num %2 == 0):
    print("Não é primo,porém é par")
if(num %2 == 1 and num %num != 0 ):
    print("Não é primo,porém é impar")
if(num %num == 0):
    print("Este numero é primo")