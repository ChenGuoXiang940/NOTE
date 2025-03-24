library verilog;
use verilog.vl_types.all;
entity DEMUL1_2_vlg_sample_tst is
    port(
        DIN             : in     vl_logic;
        S               : in     vl_logic;
        sampler_tx      : out    vl_logic
    );
end DEMUL1_2_vlg_sample_tst;
