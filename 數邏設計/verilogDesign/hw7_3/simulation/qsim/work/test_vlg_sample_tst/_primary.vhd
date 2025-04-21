library verilog;
use verilog.vl_types.all;
entity test_vlg_sample_tst is
    port(
        CLK             : in     vl_logic;
        DIN             : in     vl_logic_vector(1 downto 0);
        RESET           : in     vl_logic;
        sampler_tx      : out    vl_logic
    );
end test_vlg_sample_tst;
