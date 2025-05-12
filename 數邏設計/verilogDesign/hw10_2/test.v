`define Long
`ifdef Long
    `define Length 16
`else
    `define Length 32
`endif
module test(
    input clk,
    input rst,
    output reg [`Length-1:0] q
);
    always @(posedge clk or posedge rst)
    begin
        if (rst)
            q <= 0;
        else
            q <= q + 1'b1;
    end
endmodule