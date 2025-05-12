library verilog;
use verilog.vl_types.all;
entity test_vlg_sample_tst is
    port(
        I               : in     vl_logic_vector(3 downto 0);
        S               : in     vl_logic_vector(2 downto 0);
        sampler_tx      : out    vl_logic
    );
end test_vlg_sample_tst;
