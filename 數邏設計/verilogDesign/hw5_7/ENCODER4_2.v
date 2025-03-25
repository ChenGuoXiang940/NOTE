module ENCODER4_2(
    input [3:0] I,
    output reg A,
    output reg B
);
    always @(I)
        if(I==4'b0001)
            {A,B}=2'b00;
        else if(I==4'b0010)
            {A,B}=2'b01;
        else if(I==4'b0100)
            {A,B}=2'b10;
        else if(I==4'b1000)
            {A,B}=2'b11;
        else
            {A,B}=2'bzz;
endmodule