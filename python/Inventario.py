# BLOQUE 3 - Ciclos

# Inventario

inventario = [
    'Espada de hierro',
    'Pocion de vida',
    'Escudo de madera',
    'Llave dorada'
]

print('=== INVENTARIO ===')

for i, item in enumerate(inventario, 1):
    print(f'{i}. {item}')

buscar = 'Pocion de vida'

if buscar in inventario:
    print(f'[OK] {buscar} encontrada')
else:
    print(f'[X] {buscar} no disponible')

# Combate while

vida_hero = 80
vida_enemigo = 60
ronda = 1

while vida_hero > 0 and vida_enemigo > 0:

    dano_heroe = 15
    vida_enemigo -= dano_heroe

    dano_enemigo = 10
    vida_hero -= dano_enemigo

    print(f'Ronda {ronda}: Hero={vida_hero} | Enemigo={vida_enemigo}')

    ronda += 1

resultado = 'VICTORIA!' if vida_hero > 0 else 'DERROTA'

print(resultado)

# Ejercicio 3A

xp = 0
nivel = 1
xp_necesario = 100

batallas = [20, 35, 15, 40, 30]

for xp_ganado in batallas:

    xp += xp_ganado

    print(f'XP actual: {xp}')

    if xp >= xp_necesario:
        nivel += 1
        xp -= xp_necesario

        print(f'Nivel {nivel}')
