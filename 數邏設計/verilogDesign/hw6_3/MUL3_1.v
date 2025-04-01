module MUL3_1(
    input [2:0]I,
    input [1:0]S,
    output reg F
);
    always  @(I or S)
        case (S)
            2'b00   :F=I[0];
            2'b01   :F=I[1];
            2'b10   :F=I[2];
        endcase
endmodule