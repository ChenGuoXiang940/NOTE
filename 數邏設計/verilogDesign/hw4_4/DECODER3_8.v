module DECODER3_8(
    input A,
    input B,
    input C,
    output [7:0]Y
);
    assign Y[0]=({A,B,C}==3'o0)?1'b0:1'b1;
    assign Y[1]=({A,B,C}==3'o1)?1'b0:1'b1;
    assign Y[2]=({A,B,C}==3'o2)?1'b0:1'b1;
    assign Y[3]=({A,B,C}==3'o3)?1'b0:1'b1;
    assign Y[4]=({A,B,C}==3'o4)?1'b0:1'b1;
    assign Y[5]=({A,B,C}==3'o5)?1'b0:1'b1;
    assign Y[6]=({A,B,C}==3'o6)?1'b0:1'b1;
    assign Y[7]=({A,B,C}==3'o7)?1'b0:1'b1;
endmodule