#include <stdio.h>

int main() {
    char lowercase = 'a';
    char Ascii;

    printf("ASCII Values of lowercase:\n");

    while (lowercase <= 'z') {
        Ascii = lowercase - 32;
        printf("%c: %d \n", lowercase , Ascii );
        lowercase++;
    }

    return ;
}
