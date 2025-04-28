module BCD_SEVEN(
    input [3:0]BCD,
    output reg[7:0]SEGMENT
);
    always @(BCD)
        case(BCD)
            4'h0:SEGMENT=8'hc0;
            4'h1:SEGMENT=8'hf9;
            4'h2:SEGMENT=8'ha4;
            4'h3:SEGMENT=8'hb0;
            4'h4:SEGMENT=8'h99;
            4'h5:SEGMENT=8'h92;
            4'h6:SEGMENT=8'h82;
            4'h7:SEGMENT=8'hf8;
            4'h8:SEGMENT=8'h80;
            4'h9:SEGMENT=8'h90;
            default: SEGMENT=8'hff;
        endcase
endmodule
