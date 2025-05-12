module test(
    input [length-1:0]I,
    output reg [4:0] number
);
    parameter length=16;
    integer j;
    always @(I)
        begin
            number=5'b00000;
            j=length-1;
            repeat(length)
                begin
                    if(I[j])
                        number=number+1;
                j=j-1;
                end
        end
endmodule
