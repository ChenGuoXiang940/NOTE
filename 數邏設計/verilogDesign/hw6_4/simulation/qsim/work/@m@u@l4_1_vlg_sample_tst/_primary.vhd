library verilog;
use verilog.vl_types.all;
entity MUL4_1_vlg_sample_tst is
    port(
        I               : in     vl_logic_vector(3 downto 0);
        S               : in     vl_logic_vector(1 downto 0);
        sampler_tx      : out    vl_logic
    );
end MUL4_1_vlg_sample_tst;
