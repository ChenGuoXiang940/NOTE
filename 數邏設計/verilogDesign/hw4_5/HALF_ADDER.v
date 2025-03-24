module HALF_ADDER(
    input X,
    input Y,
    output S,
    output C
);
    assign S=(~X&Y)?1'b1:
            (X&~Y)?1'b1:
                    1'b1;
    assign C=(X&Y)?1'b1:1'b0;
endmodule