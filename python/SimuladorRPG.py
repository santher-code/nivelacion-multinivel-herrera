# BLOQUE 5 - Ejercicio integrador final

# HEROE

nombre_hero = 'Guerrero'
nivel_hero = 2
vida_hero = 80
vida_max = 80
ataque_hero = 18
defensa_hero = 8

# ENEMIGOS

enemigos = [
    ['Goblin', 40, 8],
    ['Orco', 70, 14],
    ['Dragon', 120, 25]
]

enemigos_derrotados = 0


# FUNCION COMBATE

def combatir(
    vida_hero,
    ataque_hero,
    defensa_hero,
    vida_enemigo,
    ataque_enemigo
):

    ronda = 1

    while vida_hero > 0 and vida_enemigo > 0:

        # Heroe ataca
        vida_enemigo -= ataque_hero

        # Enemigo contraataca
        dano_enemigo = ataque_enemigo - defensa_hero

        if dano_enemigo < 1:
            dano_enemigo = 1

        vida_hero -= dano_enemigo

        print(f'Ronda {ronda}')
        print(f'Heroe: {vida_hero} HP')
        print(f'Enemigo: {vida_enemigo} HP')
        print('------------------')

        ronda += 1

    return vida_hero, vida_enemigo


# CICLO PRINCIPAL

for enemigo in enemigos:

    nombre_enemigo = enemigo[0]
    vida_enemigo = enemigo[1]
    ataque_enemigo = enemigo[2]

    print(f'\n=== COMBATE VS {nombre_enemigo} ===')

    vida_hero, vida_final_enemigo = combatir(
        vida_hero,
        ataque_hero,
        defensa_hero,
        vida_enemigo,
        ataque_enemigo
    )

    if vida_hero <= 0:
        print('El heroe ha muerto. FIN DEL JUEGO')
        break

    if vida_final_enemigo <= 0:

        enemigos_derrotados += 1

        print(f'{nombre_enemigo} derrotado!')

        # Curacion
        vida_hero += 20

        if vida_hero > vida_max:
            vida_hero = vida_max

        print(f'Vida recuperada: {vida_hero}')


# RESULTADO FINAL

print('\n===== RESULTADO FINAL =====')
print(f'Enemigos derrotados: {enemigos_derrotados}')
print(f'Vida restante del heroe: {vida_hero}')

if enemigos_derrotados == 3:
    print('VICTORIA TOTAL!')
else:
    print('DERROTA...')
