# BLOQUE 2 - Condicionales

# Estado del personaje

vida = 25.0
vida_max = 100.0

pct = (vida / vida_max) * 100

if pct <= 0:
    estado = 'MUERTO'
elif pct <= 25:
    estado = 'CRITICO'
elif pct <= 50:
    estado = 'HERIDO'
elif pct <= 75:
    estado = 'ESTABLE'
else:
    estado = 'SALUDABLE'

print(f'Vida: {vida:.0f}/{vida_max:.0f} ({pct:.0f}%)')
print(f'Estado: {estado}')

# Tipo de ataque

clase = 'Mago'
nivel_habilidad = 3

match clase:
    case 'Guerrero':
        tipo_ataque = 'Espada'
    case 'Mago':
        tipo_ataque = 'Hechizo'
    case 'Arquero':
        tipo_ataque = 'Flecha'
    case _:
        tipo_ataque = 'Puno'

puede_usar_magia = (
    clase == 'Mago' and nivel_habilidad >= 3
)

if puede_usar_magia:
    print('Bola de fuego!')
else:
    print(f'{tipo_ataque} basico')

# Ejercicio 2A

vida_enemigo = 40
ataque = 35
nivel_jugador = 6

if nivel_jugador >= 5:
    bonificacion = 10
else:
    bonificacion = 0

dano_total = ataque + bonificacion
vida_restante = vida_enemigo - dano_total

print(f'Dano total: {dano_total}')
print(f'Vida restante: {vida_restante}')

if vida_restante <= 0:
    print('Enemigo derrotado! +50 XP')
elif vida_restante <= 20:
    print('Enemigo en estado critico')
else:
    print(f'Enemigo resiste. Vida restante: {vida_restante}')

# Correccion de bugs

nivel = 5
vida = 100

if nivel >= 5 and vida > 0:
    print('ok')

clase = 'Guerrero'

if clase == 'Guerrero':
    print('es guerrero')
