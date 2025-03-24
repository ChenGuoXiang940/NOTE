library verilog;
use verilog.vl_types.all;
entity RELATIONAL_vlg_check_tst is
    port(
        LARGE           : in     vl_logic;
        LARGE_EQV       : in     vl_logic;
        SMALL           : in     vl_logic;
        SMALL_EQV       : in     vl_logic;
        sampler_rx      : in     vl_logic
    );
end RELATIONAL_vlg_check_tst;
