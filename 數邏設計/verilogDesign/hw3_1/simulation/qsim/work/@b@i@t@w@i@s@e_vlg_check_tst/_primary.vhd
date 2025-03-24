library verilog;
use verilog.vl_types.all;
entity BITWISE_vlg_check_tst is
    port(
        AND_OP          : in     vl_logic;
        NAND_OP         : in     vl_logic;
        NOR_OP          : in     vl_logic;
        NOT_OP          : in     vl_logic;
        OR_OP           : in     vl_logic;
        XNOR_OP         : in     vl_logic;
        XOR_OP          : in     vl_logic;
        sampler_rx      : in     vl_logic
    );
end BITWISE_vlg_check_tst;
