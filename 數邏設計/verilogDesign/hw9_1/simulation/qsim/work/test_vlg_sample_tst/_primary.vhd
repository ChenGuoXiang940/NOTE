library verilog;
use verilog.vl_types.all;
entity test_vlg_sample_tst is
    port(
        c0              : in     vl_logic;
        x               : in     vl_logic_vector(3 downto 0);
        y               : in     vl_logic_vector(3 downto 0);
        sampler_tx      : out    vl_logic
    );
end test_vlg_sample_tst;
