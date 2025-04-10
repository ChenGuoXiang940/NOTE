void main(){
	unsigned int num=978;
	unsigned int TABLE[10];
	int i=0;
start:
    if (num == 0)
        goto end;
    TABLE[i] = num % 10;
    num /= 10;
    i++;
    goto start;
end:
    while (1);  // Á×§Kµ{¦¡µ²§ô
}