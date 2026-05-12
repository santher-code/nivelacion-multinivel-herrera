# BLOQUE 1 - Tipos de datos y variables

# Variables del personaje RPG
nombre = 'Aragorn'
nivel = 1
vida = 100.0
vida_maxima = 100.0
esta_vivo = True
clase = 'Guerrero'
puntos_ataque = 15
puntos_defensa = 10

# Verificar tipos
print(type(nombre))
print(type(nivel))
print(type(vida))
print(type(esta_vivo))

print(f'{nombre} (Nv.{nivel}) - Vida: {vida}')

# Ejercicio 1A

nombre = 'Gandalf'
clase = 'Mago'
nivel = 5
vida = 80.0
mana = 120

print(f'{nombre} [{clase}] Nv.{nivel} | Vida: {vida} | Mana: {mana}')

# Correccion de bugs

esta_vivo = True
mana = int('100')

print(esta_vivo)
print(mana)
