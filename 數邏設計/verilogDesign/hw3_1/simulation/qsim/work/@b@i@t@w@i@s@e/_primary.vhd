library verilog;
use verilog.vl_types.all;
entity BITWISE is
    port(
        A               : in     vl_logic;
        B               : in     vl_logic;
        NOT_OP          : out    vl_logic;
        AND_OP          : out    vl_logic;
        OR_OP           : out    vl_logic;
        XOR_OP          : out    vl_logic;
        NAND_OP         : out    vl_logic;
        NOR_OP          : out    vl_logic;
        XNOR_OP         : out    vl_logic
    );
end BITWISE;
