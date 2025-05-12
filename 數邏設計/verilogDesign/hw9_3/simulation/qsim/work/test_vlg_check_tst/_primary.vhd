library verilog;
use verilog.vl_types.all;
entity test_vlg_check_tst is
    port(
        number          : in     vl_logic_vector(4 downto 0);
        sampler_rx      : in     vl_logic
    );
end test_vlg_check_tst;
