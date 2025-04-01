module DECODER2_4(
    input A,
    input B,
    output reg [3:0]Y
);
    always @(A or B)
        case ({A,B})
            2'b00   :Y={4'b1110};
            2'b01   :Y={4'b1101};
            2'b11   :Y={4'b1011};
            default :Y={4'b0111};
        endcase
endmodule