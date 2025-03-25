module MUL2_1(
    input A,
    input B,
    input S,
    output reg F
);
    always @(A or B or S)
        begin
            F = A;
            if (S)
                F = B;
        end
endmodule