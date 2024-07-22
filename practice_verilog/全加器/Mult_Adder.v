module Mult_Adder (in1, in2,out1);
  input[3:0] in1,in2;
  output[4:0] out1;
  wire[3:0] carry1;

  adder adder1(.x(in1[0]),.y(in2[0]),.cin(0),.sum(out1[0]),.carry(carry1[0]));
  adder adder2(.x(in1[1]),.y(in2[1]),.cin(carry1[0]),.sum(out1[1]),.carry(carry1[1]));
  adder adder3(.x(in1[2]),.y(in2[2]),.cin(carry1[1]),.sum(out1[2]),.carry(carry1[2]));
  adder adder4(.x(in1[3]),.y(in2[3]),.cin(carry1[2]),.sum(out1[3]),.carry(carry1[3]));
  assign out1[4]=carry1[3];
endmodule
module adder (x, y,cin,sum,carry);
  input x,y,cin;
  output sum,carry;
  wire  wire1;
  xor xor1(wire1,x,y);
  assign sum=wire1^cin;
  assign carry=(wire1&cin)|(x&y);
endmodule
/*
sum = x ^ y ^ cin
carry = (x & y) | (y & cin) | (x & cin)
全加器考慮進位，半加器不考慮進位，只考慮兩個輸入的和，所以全加器比半加器多了一個進位的輸入。
*/
