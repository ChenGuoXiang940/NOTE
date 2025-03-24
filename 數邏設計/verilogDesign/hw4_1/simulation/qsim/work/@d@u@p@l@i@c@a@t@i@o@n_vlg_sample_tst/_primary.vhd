library verilog;
use verilog.vl_types.all;
entity DUPLICATION_vlg_sample_tst is
    port(
        A               : in     vl_logic_vector(7 downto 0);
        sampler_tx      : out    vl_logic
    );
end DUPLICATION_vlg_sample_tst;
