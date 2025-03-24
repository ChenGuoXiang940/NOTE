module DECODER3_5(
    input A,
    input B,
    input C,
    output [4:0] Y
);
    assign Y=(({A,B,C}==3'o0)|({A,B,C}==3'o1))?5'b11110:
            ({A,B,C}==3'o2)?5'b11101:
            (({A,B,C}==3'o3)|({A,B,C}==3'o4)|({A,B,C}==3'o5))?5'b11011:
            ({A,B,C}==3'o6)?5'b10111:5'b01111;
endmodule