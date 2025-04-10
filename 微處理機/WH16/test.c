sfr P1 = 0x90;
void main() {
    unsigned char a;
    unsigned char b;
    static unsigned char i;
    a = 0x0f;
    b = 0x33;
    P1 = 0x0f;

loop:
    i = ~a;
    i = a << 3;
    i = b >> 1;
    i = a & 0xfe;
    i = b ^ 0x01;
    i = a | 0x80;
    P1 = P1 | 0x80; 
    P1 = P1 & 0xFE;
goto loop;
}