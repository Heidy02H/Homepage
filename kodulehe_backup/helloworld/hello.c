//See on tere maailm C keeles
#include <stdio.h>

void main() {
    char nimi[255];
    fgets (nimi, sizeof nimi, stdin);
    printf("Tere %s\n", nimi);
}
//salvesta .c lõpuga ja kompileeri käsuga gcc hello.c -o hello. Käivita ./hello
