module BITWISE(input A,
input B,
output NOT_OP,
output AND_OP,
output OR_OP,
output XOR_OP,
output NAND_OP,
output NOR_OP,
output XNOR_OP);
	assign NOT_OP=~A;
	assign AND_OP=A&B;
	assign OR_OP=A|B;
	assign XOR_OP=A^B;
	assign NAND_OP=~(A&B);
	assign NOR_OP=~(A|B);
	assign XNOR_OP=(A^~B);
endmodule