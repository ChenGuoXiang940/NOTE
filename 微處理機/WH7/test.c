#include "AT89X52.H"
// �줸�ܼ�
bit clrbit;
bit setbit;

// �S��\��Ȧs�����줸
sbit P00 = P0^0;  // P0 ���� 0 ��
sbit P07 = P0^7;  // P0 ���� 7 ��

void main() {
    clrbit = 0;  // �N clrbit �ȫ��w�� 0
    setbit = 1;  // �N setbit �ȫ��w�� 1
	loop:
    P00 = setbit;  // �N P00 �]�w�� 1
    P07 = clrbit;  // �N P07 �]�w�� 0
		Delay_ms(100);
	goto loop;
}