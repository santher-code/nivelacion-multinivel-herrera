# BLOQUE 4 - Funciones

def calcular_dano(ataque: int, defensa: int) -> int:

    dano = ataque - defensa

    return dano if dano > 0 else 1


def aplicar_curacion(
    vida: float,
    cur: float,
    max_vida: float
) -> float:

    nueva = vida + cur

    return min(nueva, max_vida)


def mostrar_estado(
    nombre: str,
    vida: float,
    nivel: int
):

    print(f'{nombre} [Nv{nivel}] HP: {vida:.0f}')


# Pruebas

d = calcular_dano(20, 8)
print(f'Dano: {d}')

v = aplicar_curacion(40, 80, 100)

mostrar_estado('Frodo', v, 3)


# Ejercicio 4A

def subir_nivel(
    xp_actual: int,
    xp_necesario: int,
    nivel_actual: int
) -> int:

    if xp_actual >= xp_necesario:

        nivel_actual += 1
        xp_actual = 0

        print(f'Nivel alcanzado: {nivel_actual}')

    return nivel_actual


# Pruebas

nivel1 = subir_nivel(110, 100, 3)
print(f'Nuevo nivel: {nivel1}')

nivel2 = subir_nivel(80, 100, 3)
print(f'Nuevo nivel: {nivel2}')
